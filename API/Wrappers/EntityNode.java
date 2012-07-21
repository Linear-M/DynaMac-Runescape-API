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

public class EntityNode {
	public Object currentObject;
	public ClassHook currentHook;
	public EntityNode(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("EntityNode");
	}
	public EntityNode getPrevious(){
		Object data = currentHook.getData("getPrevious", currentObject);
		if(data!=null)
			return new EntityNode(data);
		return null;
	}
	public EntityNode getNext(){
		Object data = currentHook.getData("getNext", currentObject);
		if(data!=null)
			return new EntityNode(data);
		return null;
	}
}
