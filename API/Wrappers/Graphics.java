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

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class Graphics {
	public Object currentObject;
	public ClassHook currentHook;
	public Graphics(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Graphics");
	}
	public GraphicsDevice getGraphicsDevice(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getGraphicsDevice")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (GraphicsDevice)data;
			}
		}		
		return null;		
	}
	public DisplayMode getDisplayMode(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getDisplayMode")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (DisplayMode)data;
			}
		}		
		return null;		
	}
}
