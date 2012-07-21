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

public class NodeList {
	private Object currentObject;
	private ClassHook currentHook;
	public Node getTail(){
		Object data = currentHook.getData("getTail", currentObject);
		if(data!=null)
			return new Node(data);
		return null;
	}
	public NodeList(Object o){
		if(o==null)return;
		currentObject=o;
		currentHook = Data.indentifiedClasses.get("NodeSubQueue");
	}
}
