package gushi;

import java.util.Scanner;

public class jx {
    public static void main(String[] args) {
        try {
            String text_one = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������ ";
            char[] text_deal = text_one.toCharArray();
            int G = 1;
            int k = 0;
            for (int i = 0; i < text_one.length(); i++) {
                System.out.print(text_deal[i]);
                if (i % 7 == 6) {
                    if (G % 2 == 1) {
                        System.out.print("��");
                    } else {
                        System.out.print(".");
                        System.out.println("");
                    }
                    G += 1;
                }
            }
            System.out.println("");
            Scanner sc = new Scanner(System.in);

        
           
            System.out.println("������ĳһ����");
            String s=sc.next();
            char str2=s.charAt(0);
            for (int j=0;j<text_one.length();j++) {
            	
              if(str2==text_deal[j]){
            	  k=k+1;
              
            }
            }
            System.out.print("���ֳ��ֵĴ���:"+k);
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
  }