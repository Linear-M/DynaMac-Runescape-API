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

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class ItemDef {
	public Object currentObject;
	public ClassHook currentHook;
	public ItemDef(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("ItemDef");
	}
	public ItemDefLoader getItemDefLoader(){
		Object data = currentHook.getData("getItemDefLoader", currentObject);
		if(data!=null)
			return new ItemDefLoader(data);
		return null;
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
	public String[] getGroundActions(){
		Object data = currentHook.getData("getGroundActions", currentObject);
		if(data!=null)
			return (String[])data;
		return new String[]{};
	}
	public String[] getActions(){
		Object data = currentHook.getData("getActions", currentObject);
		if(data!=null)
			return (String[])data;
		return new String[]{};
	}
	public boolean isMembers(){
		Object data = currentHook.getData("isMembers", currentObject);
		if(data!=null)
			return Boolean.parseBoolean(data.toString());
		return false;
	}
}
