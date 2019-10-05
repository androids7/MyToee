package com.jikeyin.keinin;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Random;
public class PicActivity extends Activity {
       String path;
       ImageView img;
       TextView text;
       String[] string;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pic);
		string=new String[]{
				"�������㳤�ĳ��������ȫ��10%����\n������þ��ա���������",
				"�������㳤�ĳ��������ȫ��11%���� \n�����Сʱ��*�׹��ɣ�",
				"�������㳤�ĳ��������ȫ��9%���� \n����㳤�úܰ��� �� ��ҵ �� �й���",
				"�������㳤�ĳ��������ȫ��21%���� \n����������д��⣬�����������",
				"�������㳤�ĳ��������ȫ��31%���� \n��� �㳤����tm���ִ�",
				"�������㳤�ĳ��������ȫ��41%���� \n����㳤�ĺ��񳵻��ֳ�",
				"�������㳤�ĳ��������ȫ��43%����\n ����㳤�����β�׼ ����û���",
				"�������㳤�ĳ��������ȫ��35%���� \n����������ƨ�ɵ�ס��",
				"�������㳤�ĳ��������ȫ��29%���� \n����Ҿ��������Ͼ�ֻ���������������ˣ�һ������Ư���� һ�־�����������",
				"�������㳤�ĳ��������ȫ��48%���� \n����㳤�ú������˵��",
				"�������㳤�ĳ��������ȫ��33%���� \n�������Ҫ��¯����",
				"�������㳤�ĳ��������ȫ��33%���� \n����㳤�ĳ��������ȫ��23%����      ��TMD����̫������",
				"�������㳤�ĳ��������ȫ��33%���� \n���������ģ�û������ô��ġ�զһ��ͦ����ϸһ������",
				"�������㳤�ĳ��������ȫ��33%����  \n����㳤�������٣��㳤��̫���ڴ�",
				"�������㳤�ĳ��������ȫ��33%����  \n������������׷��������һ�ͷһ�ζ�������*��",
				"�������㳤�ĳ��������ȫ��3%����    \n�����磬�������ϵķֱ��ʵ��͵����",
				"�������㳤�ĳ��������ȫ��13%����\n����㳤��Υ��",
				"�������㳤�ĳ��������ȫ��1%����\n��������һ�߻������ó�������Ʒ",
				"�������㳤�ĳ��������ȫ��8%����\n���������������ͨ�� ",
				"�������㳤�ĳ��������ȫ��9%����\n�����ĳ���ͻ�������������",
				"�������㳤�ĳ��������ȫ��2%����\n����㻹û������ȫ��������������Ϊ��",
				"���������ĳ��������ȫ��80%����\n������������ĸ߶������Ǵﲻ����",
				"���������ĳ��������ȫ��65%����\n������治��",
				"���������ĳ��������ȫ��85%����\n���You did a good job",
				"���������ĳ��������ȫ��100%����\n���You are the best!",
				"���������ĳ��������ȫ��95%����\n���We are so proud of you",
				"���������ĳ��������ȫ��98%����\n���You are very professional!",
				"���������ĳ��������ȫ��90%����\n���Nice going!",
				"���������ĳ��������ȫ��70%����\n���You are really talented!",
				"���������ĳ��������ȫ��80%����\n������治��",
				"���������ĳ��������ȫ��87%����\n���You look like a million dollars",
				"���������ĳ��������ȫ��91%����\n���You look outstanding",
				"���������ĳ��������ȫ��82%����\n����������",
				"���������ĳ��������ȫ��50%����\n���������Ŭ��",
				"���������ĳ��������ȫ��60%����\n���������Ŷ~",
				"���������ĳ��������ȫ��75%����\n����������Ը���",
				"���������ĳ��������ȫ��83%����\n���You are so great!",
				"���������ĳ��������ȫ��79%����\n���You need more practice!"




		};
		Random random=new Random();
		int r=random.nextInt(35);
		Intent intent = this.getIntent();
		path = intent.getStringExtra("path");
		Bitmap bitmap=BitmapFactory.decodeFile(path);
		
		img=(ImageView) findViewById(R.id.img);
//		if(r>10){
//			img.res=com.jikeyin.keinin.R.drawable.pic_rs1_g_14;
//			}
		img.setImageBitmap(bitmap);
		text=(TextView) findViewById(R.id.text);
		
		text.setTextSize(20);
		text.setText(string[r]);
		
	}
       
}
