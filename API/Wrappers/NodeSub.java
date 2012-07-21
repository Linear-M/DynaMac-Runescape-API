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

public class NodeSub {
	public Object currentObject;
	public ClassHook currentHook;
	public NodeSub(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("NodeSub");
	}
	public Node getNode(){
		return new Node(currentObject);
	}
	public int getID(){
		Object data = currentHook.getData("getID", currentObject);
		if(data!=null)
			return Integer.parseInt(data.toString());
		return -1;
	}
	public NodeSub getPreviousSub(){
		Object data = currentHook.getData("getPreviousSub", currentObject);
		if(data!=null)
				return new NodeSub(data);
		return null;
	}
	public NodeSub getNextSub(){
		Object data = currentHook.getData("getNextSub", currentObject);
		if(data!=null)
			return new NodeSub(data);	
		return null;
	}
}
