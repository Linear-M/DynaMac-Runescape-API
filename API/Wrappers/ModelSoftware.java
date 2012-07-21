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

public class ModelSoftware {
	public Object currentObject;
	public ClassHook currentHook;
	public ModelSoftware(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("ModelSoftware");
	}
	public Model getModel(){
		return new Model(currentObject);
	}
}
