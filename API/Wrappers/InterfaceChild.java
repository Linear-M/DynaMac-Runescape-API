/******************************************************
* Created by Marneus901                                *
* © 2012 MarneusScripts.com                            *
* **************************************************** *
* Access to this source is unauthorized without prior  *
* authorization from its appropriate author(s).        *
* You are not permitted to release, nor distribute this* 
* work without appropriate author(s) authorization.    *
********************************************************/
package com.Marneus.Bot.API.Wrappers;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import com.Marneus.Bot.API.Methods.Client;
import com.Marneus.Bot.API.Methods.Interfaces;
import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class InterfaceChild {
	public Object currentObject;
	public ClassHook currentHook;
	public Interface parentInterface;//Top level parent
	public InterfaceChild parentInterfaceChild;//Standard component parent
	public int index;
	public InterfaceChild getParentInterfaceChild(){
		return parentInterfaceChild;
	}
	public Interface getParentInterface(){
		return parentInterface;
	}
	public InterfaceChild(Object o, Interface i, int idx){
		parentInterface = i;
		index=idx;
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("InterfaceChild");
	}
	public InterfaceChild(Object o, InterfaceChild ic, int idx){
		parentInterfaceChild=ic;
		index=idx;
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("InterfaceChild");
	}
	public Point getAbsoluteLocation() {
		final int parentId = getParentId();
		int x = 0, y = 0;
		if (parentId != -1) {
			final Point point = Client.getInterfaceHolder()[parentId >> 0x10].getChildren()[parentId & 0xffff].getAbsoluteLocation();
			x = point.x;
			y = point.y;
		} else {
			final Rectangle[] bounds = Client.getInterfaceBoundsArray();
			final int index = getBoundsArrayIndex();
			if (bounds != null && index > 0 && index < bounds.length && bounds[index] != null) {
				return new Point(bounds[index].x, bounds[index].y);
			}
		}
		if (parentId != -1) {
			InterfaceChild child = Interfaces.getChild(parentId);
			final int h = child.getHorizontalScrollbarSize(), v = child.getVerticalScrollbarSize();
			if (v > 0 || h > 0) {
				x -= child.getHorizontalScrollbarPosition();
				y -= child.getVerticalScrollbarPosition();
			}
		}
		x += getRelativeX();
		y += getRelativeY();
		return new Point(x, y);
	}
	public int getAbsoluteX() {
		int x = 0;//define x
		if(parentInterfaceChild==null){
			int idx = getBoundsArrayIndex();
			if(idx!=-1){
				x+=Client.getInterfaceBoundsArray()[idx].x;
			}
		}
		else{
			x+=parentInterfaceChild.getAbsoluteX();
		}
		x+=getRelativeX();
		return x;
	}
	public int getAbsoluteY(){
		int y = 0;//define x
		if(parentInterfaceChild==null){
			int idx = getBoundsArrayIndex();
			if(idx!=-1){
				y+=Client.getInterfaceBoundsArray()[idx].y;
			}
		}
		else{
			y+=parentInterfaceChild.getAbsoluteY();
		}
		y+=getRelativeY();
		return y;
	}
	public int getRelativeX(){
		Object data = currentHook.getData("getRelativeX", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getRelativeX").getMultiplier();
		return -1;
	}
	public int getRelativeY(){
		Object data = currentHook.getData("getRelativeY", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getRelativeY").getMultiplier();
		return -1;
	}
	public int getWidth(){
		Object data = currentHook.getData("getWidth", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getWidth").getMultiplier();
		return -1;
	}
	public int getHeight(){
		Object data = currentHook.getData("getHeight", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getHeight").getMultiplier();
		return -1;
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getID").getMultiplier();
		return -1;
	}
	public int getTextureID(){
		Object data = currentHook.getData("getTextureID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getTextureID").getMultiplier();
		return -1;
	}
	public int getParentId() {
		int parentId = getParentID();
		if (parentId != -1) {
			return parentId;
		}
		final int mainID = getID() >>> 0x10;
		for (InterfaceNode node = Client.getInterfaceNodeCache(); node != null; node = new InterfaceNode(node.getNode().getNext())) {
			if (mainID == node.getMainID()) {
				return (int) node.getMainID();
			}
		}
		return -1;
	}
	public int getParentID(){
		Object data = currentHook.getData("getParentID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getParentID").getMultiplier();
		return -1;
	}
	public int getComponentID(){
		Object data = currentHook.getData("getComponentID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getComponentID").getMultiplier();
		return -1;
	}
	public int getModelID(){
		Object data = currentHook.getData("getModelID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getModelID").getMultiplier();
		return -1;
	}
	public int getModelZoom(){
		Object data = currentHook.getData("getModelZoom", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getModelZoom").getMultiplier();
		return -1;
	}
	public int getTextColor(){
		Object data = currentHook.getData("getTextColor", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getTextColor").getMultiplier();
		return -1;
	}
	public int getVerticalScrollbarSize(){
		Object data = currentHook.getData("getVerticalScrollbarSize", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getVerticalScrollbarSize").getMultiplier();
		return -1;
	}
	public int getHorizontalScrollbarSize(){
		Object data = currentHook.getData("getHorizontalScrollbarSize", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getHorizontalScrollbarSize").getMultiplier();
		return -1;
	}
	public int getVerticalScrollbarPosition(){
		Object data = currentHook.getData("getVerticalScrollbarPosition", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getVerticalScrollbarPosition").getMultiplier();
		return -1;
	}
	public int getHorizontalScrollbarPosition(){
		Object data = currentHook.getData("getHorizontalScrollbarPosition", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getHorizontalScrollbarPosition").getMultiplier();
		return -1;
	}
	public int getVerticalScrollbarThumbSize(){
		Object data = currentHook.getData("getVerticalScrollbarThumbSize", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getVerticalScrollbarThumbSize").getMultiplier();
		return -1;
	}
	public int getHorizontalScrollbarThumbSize(){
		Object data = currentHook.getData("getHorizontalScrollbarThumbSize", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getHorizontalScrollbarThumbSize").getMultiplier();
		return -1;
	}
	public int getComponentStackSize(){
		Object data = currentHook.getData("getComponentStackSize", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getComponentStackSize").getMultiplier();
		return -1;
	}
	public int getBoundsArrayIndex(){
		Object data = currentHook.getData("getBoundsArrayIndex", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getBoundsArrayIndex").getMultiplier();
		return -1;
	}
	public int getYRotation(){
		Object data = currentHook.getData("getYRotation", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getYRotation").getMultiplier();
		return -1;
	}
	public int getXRotation(){
		Object data = currentHook.getData("getXRotation", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getXRotation").getMultiplier();
		return -1;
	}
	public int getZRotation(){
		Object data = currentHook.getData("getZRotation", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getZRotation").getMultiplier();
		return -1;
	}
	public int getModelType(){
		Object data = currentHook.getData("getModelType", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getModelType").getMultiplier();
		return -1;
	}
	public int getShadowColor(){
		Object data = currentHook.getData("getShadowColor", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getShadowColor").getMultiplier();
		return -1;
	}
	public int getBorderThickness(){
		Object data = currentHook.getData("getBorderThickness", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getBorderThickness").getMultiplier();
		return -1;
	}
	public int getComponentIndex(){
		Object data = currentHook.getData("getComponentIndex", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getComponentIndex").getMultiplier();
		return -1;
	}
	public int getType(){
		Object data = currentHook.getData("getType", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getType").getMultiplier();
		return -1;
	}
	public int getSpecialType(){
		Object data = currentHook.getData("getSpecialType", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getSpecialType").getMultiplier();
		return -1;
	}
	public InterfaceChild[] getChildren(){
		Object data = currentHook.getData("getChildren", currentObject);
		if(data!=null){
			ArrayList<InterfaceChild> array = new ArrayList<InterfaceChild>();
			int i=0;
			for(Object o : (Object[])data){
				array.add(new InterfaceChild(o, this, i));
				i++;
			}
			return array.toArray(new InterfaceChild[]{});
		}
		return new InterfaceChild[]{};
	}
	public String[] getActions(){
		Object data = currentHook.getData("getActions", currentObject);
		if(data!=null)
			return (String[])data;
		return new String[]{};
	}
	public String getSelectedActionName(){
		Object data = currentHook.getData("getSelectedActionName", currentObject);
		if(data!=null)
			return (String)data;
		return "";
	}
	public String getComponentName(){
		Object data = currentHook.getData("getComponentName", currentObject);
		if(data!=null)
			return (String)data;
		return "";
	}
	public String getText(){
		Object data = currentHook.getData("getText", currentObject);
		if(data!=null)
			return (String)data;
		return "";
	}
	public String getTooltip(){
		Object data = currentHook.getData("getTooltip", currentObject);
		if(data!=null)
			return (String)data;
		return "";
	}
	public boolean isHidden(){
		Object data = currentHook.getData("isHidden", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
	public boolean isVisible(){
		Object data = currentHook.getData("isVisible", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
	public boolean isVerticallyFlipped(){
		Object data = currentHook.getData("isVerticallyFlipped", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
	public boolean isHorizontallyFlipped(){
		Object data = currentHook.getData("isHorizontallyFlipped", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
	public boolean isInventoryInterface(){
		Object data = currentHook.getData("isInventoryInterface", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
}
