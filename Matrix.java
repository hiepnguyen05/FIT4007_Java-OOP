����   B X
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  /Nhập kích thước của ma trận (n x n): 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextInt ()I # [[I % )Nhập các phần tử của ma trận: 
  ' (  println   * + , makeConcatWithConstants (II)Ljava/lang/String;  . + / (I)Ljava/lang/String; 1 Matrix Code LineNumberTable LocalVariableTable this LMatrix; main ([Ljava/lang/String;)V j I i args [Ljava/lang/String; scanner Ljava/util/Scanner; n matrix sum StackMapTable = 
SourceFile Matrix.java BootstrapMethods I Phần tử [][]:  K ;Tổng các phần tử trên đường chéo chính là:  M
 N O P + Q $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses T %java/lang/invoke/MethodHandles$Lookup V java/lang/invoke/MethodHandles Lookup ! 0           2   /     *� �    3        4        5 6   	 7 8  2  g     �� Y� 	� L� � +� =� "N� $� &6� 26� #� � )  � -2+� O���݄���66� -2.`6���� � -  � &�    3   F          	   '  0  9  H  S  Y  _  b  k  w  }  �  4   R  3 & 9 :  * 5 ; :  e  ; :    � < =    � > ?   s @ :   l A #  b ) B :  C   & � *  D  "  � � %� � �   E    F G     L  H L  J R   
  S U W 