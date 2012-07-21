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

public class SoftReference {
	public Object currentObject;
	public ClassHook currentHook;
	public SoftReference(Object o){
		currentObject = o;
		currentHook = Data.indentifiedClasses.get("SoftReference");
	}
	public Reference getReference(){
		return new Reference(currentObject);
	}
	public NodeSub getNodeSub(){
		return new NodeSub(currentObject);
	}
	public Node getNode(){
		return new Node(currentObject);
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public java.lang.ref.SoftReference getSoftReference(){
		for(FieldHook fh : currentHook.getFieldHooks()){
			if(fh.getRefactoredName().equals("getSoftReference")){
				java.lang.ref.SoftReference data = (java.lang.ref.SoftReference)fh.getData(currentObject);
				return new java.lang.ref.SoftReference(data);
			}
		}	
		return null;
	}
}
