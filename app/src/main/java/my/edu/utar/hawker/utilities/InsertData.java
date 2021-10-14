package my.edu.utar.hawker.utilities;

import java.util.ArrayList;

import my.edu.utar.hawker.model.Hawker;

public class InsertData {

    public static ArrayList<Hawker> insertData(){
        ArrayList<Hawker> hawkerList = new ArrayList<>();

        //
        Hawker hawker1 = new Hawker();
        hawker1.setAddress("48, Jalan Queen, Pasir Penjih, 31650 Ipoh, Perak, Malaysia");
        hawker1.setDescription("Ais limau, ais pegaga , air kelapa");
        hawker1.setDisplayPhoneNo("true");
        hawker1.setOpen("true");
        hawker1.setFavourites(3);
        hawker1.setName("Pasir Pinji Air Tebu");
        hawker1.setPhone("0175476883");
        hawker1.setRecommends(6);
        hawker1.setUserReview("0 \"吉子话梅冰 喝过翻寻味\" 1 \"桔仔酸梅的确好饮，清凉解渴。\"");
        hawker1.setPreviousWeekOpeningHours("Monday \"8:45AM - 6:15PM\" Wednesday \"8:00AM - 6:15PM\" Thursday \"8:00AM - 6:15PM\" Friday \"9:45AM - 6:15PM\" Saturday \"8:30AM - 6:15PM\" Sunday \"10:00AM - 6:15PM\"");
        hawker1.setPictureName("pasir_pinji_air_tebu");
        hawkerList.add(hawker1);

        //
        Hawker hawker2 = new Hawker();
        hawker2.setAddress("新嘉喜茶室 400, Jalan Perak 4, 31900 Kampar, Perak, Malaysia");
        hawker2.setDescription("煮炒 Fried dishes with rice, noodles ");
        hawker2.setDisplayPhoneNo("true");
        hawker2.setOpen("true");
        hawker2.setFavourites(5);
        hawker2.setName("SOON KEE");
        hawker2.setPhone("0125129369");
        hawker2.setRecommends(4);
        hawker2.setUserReview("0 \"Always come here for lunch when I'm in Kampar. Nice food, very friendly service.\" 1 \"干炒河非常好吃！！！！！！！\"");
        hawker2.setPreviousWeekOpeningHours("");
        hawker2.setPictureName("fried");
        hawkerList.add(hawker2);

        //
        Hawker hawker3 = new Hawker();
        hawker3.setAddress("221, Jalan Sultan, Pasir Penjih, 31650 Ipoh, Perak, Malaysia");
        hawker3.setDescription("Fried chicken");
        hawker3.setDisplayPhoneNo("true");
        hawker3.setOpen("true");
        hawker3.setFavourites(14);
        hawker3.setName("Galilee Fried Chicken");
        hawker3.setPhone("0125084686");
        hawker3.setRecommends(17);
        hawker3.setUserReview("0 \"Very uniquely crispy fried chicken \uD83D\uDC4D\" 1 \"老字号 同宝利炸鸡有得fight\"");
        hawker3.setPreviousWeekOpeningHours("Wednesday \"9:00AM - 7:00PM\" Thursday \"9:45AM - 7:15PM\" Friday \"8:15AM - 7:00PM\" Saturday \"10:00AM - 7:30PM\" Sunday \"9:00AM - 7:00PM\"");
        hawker3.setPictureName("galilee_fried_chicken");
        hawkerList.add(hawker3);

        //
        Hawker hawker4 = new Hawker();
        hawker4.setAddress("No. 550 A, Jalan Queen, Pasir Pinji, Perak, Pasir Penjih, 31650 Ipoh, Perak, Malaysia");
        hawker4.setDescription("mah chee , and peanut sauce麻芝 ，花生糊");
        hawker4.setDisplayPhoneNo("true");
        hawker4.setOpen("true");
        hawker4.setFavourites(2);
        hawker4.setName("Hong Kee Mah Chee");
        hawker4.setPhone("0185703832");
        hawker4.setRecommends(3);
        hawker4.setUserReview("0 \"This is another stall that has been around for many years. Second generation selling, with nice seatings now if you want to eat at the stall itself.\" 1 \" 花生糊 某得顶\uD83D\uDC4D\"");
        hawker4.setPreviousWeekOpeningHours("Monday \"12:00PM - 5:30PM\" Tuesday \"11:45AM - 5:30PM\" Wednesday \"2:15PM - 5:45PM\"");
        hawker4.setPictureName("machee_peanut_source");
        hawkerList.add(hawker4);

        //
        Hawker hawker5 = new Hawker();
        hawker5.setAddress("Jalan Bunga Raya, 31650 Ipoh, Perak, Malaysia");
        hawker5.setDescription("Cendol, jelly kuning");
        hawker5.setDisplayPhoneNo("true");
        hawker5.setOpen("true");
        hawker5.setFavourites(4);
        hawker5.setName("Pat Che Yoon");
        hawker5.setPhone("0124102108");
        hawker5.setRecommends(5);
        hawker5.setUserReview("0 \"I have been eating this ais cendol for like forever. Of course, they have been in business for over 20 years!\" 1 \"One of the best ais cendol in ipoh, near 兵如港附近的大草场，price still remain cheap after so many years \uD83D\uDC4D\" 2 \"红豆很香 椰糖更香\"");
        hawker5.setPreviousWeekOpeningHours("Tuesday \"11:45AM - 6:30PM\" Wednesday \"11:45AM - 5:15PM\" Thursday \"11:15AM - 5:00PM\" Friday \"11:30AM - 5:00PM\" Sunday \"10:15AM - 5:00PM\"");
        hawker5.setPictureName("cendol_jelly_kuning");
        hawkerList.add(hawker5);

        //
        Hawker hawker6 = new Hawker();
        hawker6.setAddress("48, Jalan Queen, Pasir Penjih, 31650 Ipoh, Perak, Malaysia");
        hawker6.setDescription("Tau fu far, soya milk and black jelly. 汤丸 on Friday, Saturday and Sunday. ");
        hawker6.setDisplayPhoneNo("true");
        hawker6.setOpen("true");
        hawker6.setFavourites(1);
        hawker6.setName("Woong Kee 豆腐花");
        hawker6.setPhone("0165104540");
        hawker6.setRecommends(2);
        hawker6.setUserReview("0 \"Our favourite tau fu far in the neighbourhood.\"");
        hawker6.setPreviousWeekOpeningHours("Monday \"4:45PM - 9:15PM\" Tuesday \"5:00PM - 9:30PM\" Thursday \"5:00PM - 9:15PM\" Friday \"4:00PM - 8:45PM\" Sunday \"4:00AM - 8:30PM\"");
        hawker6.setPictureName("douhuhua");
        hawkerList.add(hawker6);

        //
        Hawker hawker7 = new Hawker();
        hawker7.setAddress("45, Taman Mayfair, 31650 Ipoh, Perak, Malaysia");
        hawker7.setDescription("Taiwanese Dessert Multiple Choice of Taro Ball With Base of Grassjelly");
        hawker7.setDisplayPhoneNo("true");
        hawker7.setOpen("true");
        hawker7.setFavourites(1);
        hawker7.setName("Ipoh GrassJelly 怡保仙草芋丸");
        hawker7.setPhone("01111998913");
        hawker7.setRecommends(2);
        hawker7.setUserReview("0 \"The grass jelly is indeed very good. The portion for a bowl is enough for two person! \" 1 \"火龙丸 高度推荐！ 超弹牙\uD83D\uDE0B\"");
        hawker7.setPreviousWeekOpeningHours("Thursday \"5:00PM - 6:00PM\" Friday \"11:15AM - 6:00PM\"\n");
        hawker7.setPictureName("ipoh_grass_jelly");
        hawkerList.add(hawker7);

        //
        Hawker hawker8 = new Hawker();
        hawker8.setAddress("38b, Persiaran Bunga Saroja 10, Taman Melor, 31650 Ipoh, Perak, Malaysia");
        hawker8.setDescription("Burger Ramly selera sedaap");
        hawker8.setDisplayPhoneNo("true");
        hawker8.setOpen("false");
        hawker8.setFavourites(1);
        hawker8.setName("Azka Burger");
        hawker8.setPhone("01133502551");
        hawker8.setRecommends(1);
        hawker8.setUserReview("");
        hawker8.setPreviousWeekOpeningHours("");
        hawker8.setPictureName("burger_ramly");
        hawkerList.add(hawker8);

        //
        Hawker hawker9 = new Hawker();
        hawker9.setAddress("Jalan Bunga Raya, 31650 Ipoh, Perak, Malaysia");
        hawker9.setDescription("Apam balik, 大塊面，花生糊");
        hawker9.setDisplayPhoneNo("true");
        hawker9.setOpen("true");
        hawker9.setFavourites(2);
        hawker9.setName("民歡大塊面");
        hawker9.setPhone("01160624524");
        hawker9.setRecommends(3);
        hawker9.setUserReview("");
        hawker9.setPreviousWeekOpeningHours("");
        hawker9.setPictureName("dakauimian");
        hawkerList.add(hawker9);

        //
        Hawker hawker10 = new Hawker();
        hawker10.setAddress("1 A, Hala Pinji 1, Taman Hoover, 31650 Ipoh, Perak, Malaysia");
        hawker10.setDescription("Assam fish");
        hawker10.setDisplayPhoneNo("true");
        hawker10.setOpen("true");
        hawker10.setFavourites(3);
        hawker10.setName("豪食阿三鱼头");
        hawker10.setPhone("0193394351");
        hawker10.setRecommends(7);
        hawker10.setUserReview("0 \"A good place to tapau assam curry home \uD83D\uDC4D\" 1 \"鱼头煲也有很多鱼肉，最重要 asam 好入味\"");
        hawker10.setPreviousWeekOpeningHours("Monday \"1:00PM - 9:00PM\" Tuesday \"4:15PM - 9:30PM\" Thursday \"12:15PM - 9:00PM\" Friday \"1:00PM - 8:45PM\" Saturday \"1:15PM - 9:15PM\" Sunday \"12:30PM - 8:00PM\"");
        hawker10.setPictureName("fishhead");
        hawkerList.add(hawker10);

        return hawkerList;
    }
}
