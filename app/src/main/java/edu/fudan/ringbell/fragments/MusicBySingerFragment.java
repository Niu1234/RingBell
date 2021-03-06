package edu.fudan.ringbell.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import edu.fudan.ringbell.R;
import edu.fudan.ringbell.adapter.MusicAdapter;
import edu.fudan.ringbell.entity.MusicInfo;
import edu.fudan.ringbell.media.MediaUtil;


import java.util.List;

/**
 * Created by niuzhenghao on 2017/11/27.
 */

public class MusicBySingerFragment extends Fragment {
    private ListView mMusiclist;                   //音乐列表
    private MusicAdapter mAdapter;
    List<MusicInfo> musicInfos = null;


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // inflater.inflate(resource, null);

        View view = inflater.inflate(R.layout.fragment_mr_singer, container, false);
        mMusiclist = (ListView) view.findViewById(R.id.musiclistbysinger);
        //为ListView添加数据源
        musicInfos = MediaUtil.getMusicInfos(getActivity().getApplicationContext());  //获取歌曲对象集合
        mAdapter =  new MusicAdapter(this.getActivity(),musicInfos);
        mMusiclist.setAdapter(mAdapter);
        return view;
    }

}
