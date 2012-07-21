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

public class BaseInfo {
	public Object currentObject;
	public ClassHook currentHook;
	public BaseInfo(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("BaseInfo");
	}
	public int getX(){
		Object data = currentHook.getData("getX", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getX").getMultiplier();
		return -1;
	}
	public int getY(){
		Object data = currentHook.getData("getY", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString()) * currentHook.getFieldHook("getY").getMultiplier();
		return -1;
	}
}
