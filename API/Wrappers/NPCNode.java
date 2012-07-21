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

public class NPCNode {
	public Object currentObject;
	public ClassHook currentHook;
	public NPCNode(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("NPCNode");
	}
	public Node getNode(){
		return new Node(currentObject);
	}
	public NPC getNPC(){
		Object data = currentHook.getData("getNPC", currentObject);
		if(data!=null)
			return new NPC(data);
		return null;
	}
}
