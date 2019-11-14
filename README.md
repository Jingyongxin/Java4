# 计G191 2019322176 静永鑫
# 实验目的
掌握字符串String及其方法的使用
掌握异常处理结构
# 实验内容与要求
# # 内容：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能函数，并运行。达到如下功能
# # 要求：
1.每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2.允许提供输入参数，统计古诗中某个字或词出现的次数
3.考虑操作中可能出现的异常，在程序中设计异常处理程序
# # 实验过程
```java
package gushi;

import java.util.Scanner;

public class jx {
    public static void main(String[] args) {
        try {
            String text_one = "汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户遂令天下父母心不重生男重生女骊宫高处入青云仙乐风飘处处闻缓歌慢舞凝丝竹尽日君王看不足渔阳鼙鼓动地来惊破霓裳羽衣曲九重城阙烟尘生千乘万骑西南行 ";
            char[] text_deal = text_one.toCharArray();
            int G = 1;
            int k = 0;
            for (int i = 0; i < text_one.length(); i++) {
                System.out.print(text_deal[i]);
                if (i % 7 == 6) {
                    if (G % 2 == 1) {
                        System.out.print("，");
                    } else {
                        System.out.print(".");
                        System.out.println("");
                    }
                    G += 1;
                }
            }
            System.out.println("");
            Scanner sc = new Scanner(System.in);

        
           
            System.out.println("请输入某一个字");
            String s=sc.next();
            char str2=s.charAt(0);
            for (int j=0;j<text_one.length();j++) {
            	
              if(str2==text_deal[j]){
            	  k=k+1;
              
            }
            }
            System.out.print("该字出现的次数:"+k);
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
  }
  ```
  ## 流程图
  ![images](https://github.com/Jingyongxin/Java4/blob/master/流程图.png)
  ## 实验结果
  ![images](https://github.com/Jingyongxin/Java4/blob/master/运行结果.png)
  ## 实验感想
  通过本次实验，发现了自己的很多不足,str数组和scanner键盘输入方法实现掌握的还不是很熟练，但在老师和同学的帮助下勉强完成了实验 在接下来学习中定会加倍努力弥补自己的不足。
