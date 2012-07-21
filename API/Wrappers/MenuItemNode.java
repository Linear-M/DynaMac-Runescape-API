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

public class MenuItemNode {
	public Object currentObject;
	public ClassHook currentHook;
	public MenuItemNode(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("MenuItemNode");
	}
	public NodeSub getNodeSub(){
		return new NodeSub(currentObject);
	}
	public Node getNode(){
		return new Node(currentObject);
	}
	public String getAction(){
		Object data = currentHook.getData("getAction", currentObject);
		if(data!=null)
			return data.toString();
		return "";
	}
	public String getOption(){
		Object data = currentHook.getData("getOption", currentObject);
		if(data!=null)
			return data.toString();
		return "";
	}
}
