/******************************************************
* Created by Marneus901                                *
* � 2012 MarneusScripts.com                            *
* **************************************************** *
* Access to this source is unauthorized without prior  *
* authorization from its appropriate author(s).        *
* You are not permitted to release, nor distribute this* 
* work without appropriate author(s) authorization.    *
********************************************************/
package com.Marneus.Bot.API.Wrappers;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;

public class Chatline {
	public Object currentObject;
	public ClassHook currentHook;
	public Chatline(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Chatline");
	}
	public String getMessage(){
		try{
			if(currentHook!=null && currentHook.containsFieldHook("getMessage")){
				Object data = currentHook.getData("getMessage");
				if(data!=null)
					return data.toString();
			}
		}
		catch(Exception e){
		}
		return "";
	}
}