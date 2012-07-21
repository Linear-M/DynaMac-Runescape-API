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

public class Cache {
	public Object currentObject;
	public ClassHook currentHook;
	public Cache(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Cache");
	}
	public HashTable getTable(){//This is the api
		Object data = currentHook.getData("getTable", currentObject);//New dynamic hook system
		if(data!=null)
			return new HashTable(data);
		return null;//Normal scripts have to null check ofc
	}
}
