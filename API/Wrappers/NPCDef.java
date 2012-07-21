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

public class NPCDef {
	private Object currentObject;
	private ClassHook currentHook;
	public int getID(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getID")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return -1;
				}
				else{
					return Integer.parseInt(data.toString());
				}
			}
		}		
		return -1;
	}
	public String[] getActions(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getActions")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return null;
				}
				else{
					return (String[])data;
				}
			}
		}
		return null;
	}
	public String getName(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getName")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return "";
				}
				else{
					return data.toString();
				}
			}
		}
		return "";
	}
	public NPCDef(Object o){
		if(o==null)return;
		currentObject=o;
		currentHook = Data.indentifiedClasses.get("NPCDef");
	}
}
