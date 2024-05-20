package com.ohgiraffers.section01.conditional;

public class Application {
    public void main(String[] args) {

    A_If aIf = new A_If();

//    aIf.testSimpleIfStatement();  //단일 IF문
//      aIf.testNestedIfStatement(); //중첩IF문

        B_IfElse bIfElse = new B_IfElse();

//        bIfElse.testSimplIfElseStaement();


        B_IfElse bIfElse1 = new B_IfElse(); //단일 IF-ELSE문

//        bIfElse1.testNestedIfElseStatement(); //중첩 IF-ELSE문




//        C_IfElseIf cIfElseIf = new C_IfElseIf();  //단일 IF-ELSE-if문

//        cIfElseIf.testSimpleIfElseIfStataement(); //중첩 IF-ELSE-if문




        C_IfElseIf cIfElseIf = new C_IfElseIf();

//        cIfElseIf.testSimpleIfElseIfStatement();

        cIfElseIf.testNestedIfElseIfStatement2();

        D_switch dSwitch = new D_switch();
//        dSwitch.testSimpleSwitchStatement();
//
        dSwitch.testSwitchVendingMachine();


    }



}
