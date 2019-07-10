# java-concurrent-audition
并发编程面试题

## 目录


[synchronized 关键字](./src/c_001/SynchronizedDemo.java)
[]


synchronized重量级锁

[volatile只能保证可见性，不能保证原子性](./src/c_013/T.java)

synchronized即保证可见性，又保证原子性。

面试题（淘宝？）
 实现一个容器，提供两个方法，add，size
 写两个线程，线程1添加10个元素到容器中，线程2实现监控元素的个数，
 当个数到达5时，线程2给出提示并结束
[容器](./src/c_019_m/MyContainer1.java)


[门栓的使用](./src/c_019_m/MyContainer5.java)

---

synchronizer 同步器

同步容器

ThreadPool、executor




---

# java-concurrent
Java 并发编程学习源码

compile-version: 1.8 以上

## 马士兵老师java多线程高并发编程 视频源码

**B站地址**：https://www.bilibili.com/video/av33688545/  

**源码包**：`mashibing/src`

- 视频p18： c_001 ~ c_005
- 视频p19:  c_006 ~ c_009
- 视频p20： c_010 ~ c_012
- 视频p21： c_013 ~ c_018
- 视频p22/23： c_19 面试题
- 视频p1/p2： c_20
- 视频p2/p3/p4：  c_21 面试题
- 视频p5： c_22
- 视频p6： c_23
- 视频P7:  c_24
- 视频p7~p10：c_25 并发集合 
- 视频p12~p17: c_26 线程池
