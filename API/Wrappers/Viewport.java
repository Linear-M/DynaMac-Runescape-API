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
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class Viewport {
	public Object currentObject;
	public ClassHook currentHook;
	public Viewport(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Viewport");
	}
	public float[] getFloats(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getFloats")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (float[])data;
			}
		}		
		return null;		
	}
}
