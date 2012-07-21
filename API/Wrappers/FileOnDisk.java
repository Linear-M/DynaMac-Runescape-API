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

import java.io.File;

import com.Marneus.Enviroment.Data;
import com.Marneus.Enviroment.Hook.ClassHook;
import com.Marneus.Enviroment.Hook.ClassHook.FieldHook;

public class FileOnDisk {
	public Object currentObject;
	public ClassHook currentHook;
	public FileOnDisk(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("FileOnDisk");
	}
	public File getFile(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getFile")){
				Object data = fh.getData(currentObject);
				if(data!=null)
					return (File)data;
			}
		}		
		return null;		
	}
}
