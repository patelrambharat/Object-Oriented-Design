package com.company;

public class PlanFactory {
     public Plan getPlan(String planName){//plan name ke adhar pe object return karta hai
         if(planName == null){
             return null;
         }
         if(planName.equalsIgnoreCase("domestic")){
             return new DomesticPlan();
         }
         else if(planName.equalsIgnoreCase("commercial")){
             return new CommercialPlan();
         }
         else if(planName.equalsIgnoreCase("institutional")){
             return  new InstitutionalPlan();
         }
         return null;
     }
}
