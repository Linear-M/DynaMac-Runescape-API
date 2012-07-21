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

public class Interactable {
	public Object currentObject;
	public ClassHook currentHook;
	public Interactable(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Interactable");
	}
	
	public byte getPlane(){
		Object data = currentHook.getData("getPlane", currentObject);
		if(data!=null)
			return Byte.parseByte(data.toString());		
		return -1;
	}
}
