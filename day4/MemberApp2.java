package com.example.day4;

public class MemberApp2 {
    public static void main(String[] args) {
//5명의 member 추가(G2,v2,vv1
        GeneralMember mem1 = new GeneralMember("user1","A");
        GeneralMember mem2 = new GeneralMember("user2","A");
        VipMember vip1 =new VipMember("vip1","S1");
        VipMember vip2 =new VipMember("vip2","S2");
        VvipMember vvip1 =new VvipMember("vvip1");

        //array로 관리
        IMemberFunc[] members = new IMemberFunc[5];
        members[0] = mem1;
        members[1] = mem2;
        members[2] = vip1;
        members[3] = vip2;
        members[4] = vvip1;

        for(IMemberFunc member : members){
//            System.out.println(member.id + "/" + member.joinDate);
           member.setPoint(100);
           member.display();
        }

        Object[] obj = new Object[3];
       obj[0] = new GeneralMember("user3","c");
       obj[1] = new VipMember("vip3","S3");
       obj[2] = new VvipMember("vvip3");

       for(Object o : obj){
           IMemberFunc member = null;
           if(o instanceof GeneralMember){
               member = (GeneralMember)o;
           }else if(o instanceof VipMember){
               member = (VipMember) o;
           }else if(o instanceof  VvipMember){
               member = (VvipMember)o;
           }

           member.setPoint(200);
           member.display();
       }
    }
}
