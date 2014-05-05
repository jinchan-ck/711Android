package com.sweetvvck.seven11;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageLoader.ImageCache;
import com.android.volley.toolbox.ImageLoader.ImageListener;
import com.sweetvvck.app.Seven11;
import com.sweetvvck.bean.ShareInfo;
import com.sweetvvck.utils.BitmapCache;

/**
 * A fragment representing a single Item detail screen. This fragment is either
 * contained in a {@link ItemListActivity} in two-pane mode (on tablets) or a
 * {@link ItemDetailActivity} on handsets.
 */
public class ItemDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private ShareInfo mItem;
	
	private ImageLoader mImageLoader;
	
	private ImageView mIvPhoto;
	private static ImageCache mImageCache = new BitmapCache();

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ItemDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = ItemListFragment.mAdapter.getItem(getArguments().getInt(ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_item_detail,
				container, false);
		this.mImageLoader = new ImageLoader(Seven11.getVolleyReqQueue(), mImageCache);
		mIvPhoto = (ImageView) rootView.findViewById(R.id.iv_photo);
		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			ImageListener listener = ImageLoader.getImageListener(mIvPhoto,  
			        R.drawable.ic_launcher, R.drawable.ic_launcher); 
			mImageLoader.get("http://192.168.199.107:8765/avatar?user=" + mItem.getUser(), listener);
		}
		mIvPhoto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Toast.makeText(getActivity(), (mItem.getUser().contains("sweetvvck")) + "", Toast.LENGTH_LONG).show();
				DisplayActivity.startDisplayActivity(getActivity(), mItem.getUser().contains("sweetvvck") ? 0 : 1);
			}
		});
		return rootView;
	}
}
