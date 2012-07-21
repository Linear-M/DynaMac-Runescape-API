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

public class Animable {
	public Object currentObject;
	public ClassHook currentHook;
	public Animable(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("Animable");
	}
	public Interactable getInteractable(){
		return new Interactable(currentObject);
	}
	public short getMinX(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getMinX")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return -1;
				}
				else{
					return Short.parseShort(data.toString());
				}
			}
		}		
		return -1;
	}
	public short getMaxX(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getMaxX")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return -1;
				}
				else{
					return Short.parseShort(data.toString());
				}
			}
		}		
		return -1;
	}
	public short getMinY(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getMinY")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return -1;
				}
				else{
					return Short.parseShort(data.toString());
				}
			}
		}		
		return -1;
	}
	public short getMaxY(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getMaxY")){
				Object data = fh.getData(currentObject);
				if(data==null){
					return -1;
				}
				else{
					return Short.parseShort(data.toString());
				}
			}
		}		
		return -1;
	}
}
