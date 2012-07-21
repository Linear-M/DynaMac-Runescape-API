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

public class ObjectDef {
	public Object currentObject;
	public ClassHook currentHook;
	public ObjectDef(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("ObjectDef");
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
	public String[] getActions(){
		Object data = currentHook.getData("getActions", currentObject);
		if(data!=null)
			return (String[])data;
		return new String[]{};
	}
	public String getName(){
		Object data = currentHook.getData("getName", currentObject);
		if(data!=null)
			return data.toString();
		return "";
	}
}
