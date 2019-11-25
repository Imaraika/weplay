package com.example.weplay;

//public class GridviewBaseAdapter extends BaseAdapter {
//    public ArrayList<GridViewBean> arraylistListener;
//    private List<GridViewBean> mListenerList;
//    Context mContext;
//
//    public GridviewBaseAdapter(List<GridViewBean> mListenerList, Context context) {
//
//        mContext = context;
//        this.mListenerList = mListenerList;
//        this.arraylistListener = new ArrayList<GridViewBean>();
//        this.arraylistListener.addAll(mListenerList);
//
//    }
//
//    public class ViewHolder {
//
//        ImageView mItemPic;
//
//    }
//
//    @Override
//    public int getCount() {
//        return mListenerList.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return mListenerList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(final int position, View view, ViewGroup parent) {
//        final ViewHolder holder;
//        if (view == null) {
//            view = LayoutInflater.from(mContext).inflate(R.layout.layout_gv_adapter, null);
//            holder = new ViewHolder();
//            holder.mItemPic = (ImageView) view.findViewById(R.id.im_test);
//
//
//            view.setTag(holder);
//        } else {
//            holder = (ViewHolder) view.getTag();
//
//        }
//        try {
//            int image = mListenerList.get(position).getImage();
//            holder.mItemPic.setImageResource(image);
//        }catch (Exception ex){
//
//
//        }
//
//        return view;
//    }

//}