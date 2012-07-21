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

public class ObjectDefLoader {
	public Object currentObject;
	public ClassHook currentHook;
	public ObjectDefLoader(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("ObjectDefLoader");
	}
	public Cache getCache(){
		Object data = currentHook.getData("getCache", currentObject);
		if(data!=null)
			return new Cache(data);		
		return null;
	}
	public ObjectModelHolder getModelHolder(){
		Object data = currentHook.getData("getModelHolder", currentObject);
		if(data!=null)
			return new ObjectModelHolder(data);		
		return null;
	}
}
