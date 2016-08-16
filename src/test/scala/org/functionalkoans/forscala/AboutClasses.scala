package org.functionalkoans.forscala

import support.KoanSuite

class AboutClasses extends KoanSuite {


  // you can define class with var or val parameters
  class ClassWithVarParameter(var d: String){
    private var _description = d
    def description = _description
    def description_= (d:String):Unit = _description = d
  }

  class ClassWithValParameter(val n: String){
    private var _name = n
    def name = _name
  }

  koan("val parameters in class definition define getter") {
    val aClass = new ClassWithValParameter("Juan")
    aClass.name should be("Juan")
  }

  koan("var parameters in class definition define getter and setter") {
    val aClass = new ClassWithVarParameter("description goes here")
    aClass.description should be("description goes here")

    aClass.description = "new description"
    aClass.description should be("new description")
  }

  // you can define class with private fields
  class ClassWithPrivateFields(name: String)

  koan("fields defined internally are private to class") {
    val aClass = new ClassWithPrivateFields("name")

    // NOTE: aClass.name is not accessible
  }

}
