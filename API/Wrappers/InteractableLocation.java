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

public class InteractableLocation {
	public Object currentObject;
	public ClassHook currentHook;
	public InteractableLocation(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("InteractableLocation");
	}
	public float getX(){
		Object data = currentHook.getData("getX", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;		
	}
	public float getY(){
		Object data = currentHook.getData("getY", currentObject);
		if(data!=null)
			return Float.parseFloat(data.toString());
		return -1;		
	}
}
