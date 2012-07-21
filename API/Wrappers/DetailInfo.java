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

public class DetailInfo {
	public Object currentObject;
	public ClassHook currentHook;
	public DetailInfo(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("DetailInfo");
	}
	public int getLevel(){
		Object data = currentHook.getData("getLevel", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
}
