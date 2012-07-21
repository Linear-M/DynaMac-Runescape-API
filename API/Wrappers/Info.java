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

public class Info {
	public Object currentObject;
	public ClassHook currentHook;
	public Info(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Info");
	}
	public GroundInfo getGroundInfo(){
		Object data = currentHook.getData("getGroundInfo", currentObject);
		if(data!=null)
			return new GroundInfo(data);
		return null;		
	}
	public BaseInfo getBaseInfo(){
		Object data = currentHook.getData("getBaseInfo", currentObject);
		if(data!=null)
			return new BaseInfo(data);
		return null;		
	}
	public GroundBytes getGroundBytes(){
		Object data = currentHook.getData("getGroundBytes", currentObject);
		if(data!=null)
			return new GroundBytes(data);
		return null;		
	}
	public GroundData getGroundData(){
		Object data = currentHook.getData("getGroundData", currentObject);
		if(data!=null)
			return new GroundData(data);
		return null;		
	}
	public ObjectDefLoader getObjectDefLoaders(){
		Object data = currentHook.getData("getObjectDefLoaders", currentObject);
		if(data!=null)
			return new ObjectDefLoader(data);
		return null;		
	}
}
