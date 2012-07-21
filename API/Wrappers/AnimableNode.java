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

public class AnimableNode {
	public Object currentObject;
	public ClassHook currentHook;
	public AnimableNode(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("AnimableNode");
	}
	public AnimableNode getNext(){
		Object data = currentHook.getData("getNext", currentObject);
		if(data!=null)
			return new AnimableNode(data);
		return null;
	}
	public Animable getAnimable(){
		Object data = currentHook.getData("getAnimable", currentObject);
		if(data!=null)
			return new Animable(data);
		return null;
	}
	public Interactable getInteractable(){
		Animable obj = getAnimable();
		if(obj!=null)
			return obj.getInteractable();
		return null;
	}
}
