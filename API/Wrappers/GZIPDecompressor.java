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

import java.util.zip.Inflater;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class GZIPDecompressor {
	public Object currentObject;
	public ClassHook currentHook;
	public GZIPDecompressor(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("GZIPDecompressor");
	}
	public Inflater getInflater(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getInflater")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (Inflater)data;
			}
		}		
		return null;		
	}
}
