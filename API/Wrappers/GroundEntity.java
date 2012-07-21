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

public class GroundEntity {
	public Object currentObject;
	public ClassHook currentHook;
	public GroundEntity(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("GroundEntity");
	}
	public Interactable getInteractable(){
		return new Interactable(currentObject);
	}
}
