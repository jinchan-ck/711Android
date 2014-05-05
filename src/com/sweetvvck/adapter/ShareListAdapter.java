package com.sweetvvck.adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.sweetvvck.app.Seven11;
import com.sweetvvck.bean.ShareInfo;
import com.sweetvvck.seven11.R;
import com.sweetvvck.utils.BitmapCache;

public class ShareListAdapter extends BaseAdapter {
	
	private List<ShareInfo> mItems = new ArrayList<ShareInfo>();
	private Context mContext;
	private LayoutInflater mInflater;
	private ImageLoader mImageLoader;
	private static ImageCache mImageCache = new BitmapCache();
	
	public ShareListAdapter(Context context){
		this.mContext = context;
		this.mInflater = LayoutInflater.from(context);
		this.mImageLoader = new ImageLoader(Seven11.getVolleyReqQueue(), mImageCache);
	}
	
	public void updateItems(List<ShareInfo> items){
		mItems.clear();
		if(items != null && !items.isEmpty()){
			mItems.addAll(items);
		}
		notifyDataSetChanged();
	}

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public ShareInfo getItem(int position) {
		return mItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	ViewHolder holder;
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ShareInfo item = getItem(position);
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.share_list_item, null);
			holder = new ViewHolder();
			holder.tvTitle = (TextView) convertView.findViewById(R.id.tv_title);
			holder.tvDate = (TextView) convertView.findViewById(R.id.tv_date);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		SimpleDateFormat sdf = new SimpleDateFormat("MM dd", Locale.CHINA);
		Date date = new Date(Long.parseLong(item.getTimestamp()));
		String dateStr = sdf.format(date);
		holder.tvDate.setText(dateStr);
		holder.tvTitle.setText(item.getTitle());
		System.out.println(date.toLocaleString());
		return convertView;
	}

	static class ViewHolder{
		public TextView tvTitle;
		public TextView tvDate;
	}
	
}
