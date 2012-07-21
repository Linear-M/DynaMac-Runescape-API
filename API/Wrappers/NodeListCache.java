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

public class NodeListCache {
	public Object currentObject;
	public ClassHook currentHook;
	public NodeListCache(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("NodeListCache");
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());			
		return -1;
	}
	public NodeListCache getPrevious(){
		Object data = currentHook.getData("getPrevious", currentObject);
		if(data!=null)
			return new NodeListCache(data);
		return null;
	}
	public NodeListCache getNext(){
		Object data = currentHook.getData("getNext", currentObject);
		if(data!=null)
			return new NodeListCache(data);
		return null;
	}
	public Node getNode(){
		return new Node(currentObject);
	}
}
