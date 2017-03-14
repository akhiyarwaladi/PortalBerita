package com.example.aw.berita.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.aw.berita.R;
import com.example.aw.berita.Timeline;
import com.example.aw.berita.model.TimelineItem;

import java.util.List;

/**
 * Created by AW on 3/14/2017.
 */

public class TimelineListAdapter extends BaseAdapter {
    private Context mcontext;
    private List<TimelineItem> timelineItems;

    public TimelineListAdapter(Context mcontext, List<TimelineItem> timelineItems) {
        this.mcontext = mcontext;
        this.timelineItems = timelineItems;
    }

    @Override
    public int getCount() {
        return timelineItems.size();
    }

    @Override
    public Object getItem(int i) {
        return timelineItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = View.inflate(mcontext, R.layout.list_item_timeline, null);
        TextView tvname = (TextView)v.findViewById(R.id.username);
        TextView tvtime = (TextView)v.findViewById(R.id.timestamp);
        TextView tvlink = (TextView)v.findViewById(R.id.link);
        TextView tvstatus = (TextView)v.findViewById(R.id.status);

        tvname.setText(timelineItems.get(i).getUsername());
        tvtime.setText(timelineItems.get(i).getTimestamp());
        tvlink.setText(timelineItems.get(i).getLink());
        tvstatus.setText(timelineItems.get(i).getStatus());

        return v;
    }
}
