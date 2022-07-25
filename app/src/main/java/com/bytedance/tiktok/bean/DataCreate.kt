package com.bytedance.tiktok.bean

import com.bytedance.tiktok.R
import com.bytedance.tiktok.bean.VideoBean.UserBean

/**
 * create by libo
 * create on 2020-06-03
 * description 本地数据创建，代替接口获取数据
 */
object DataCreate {
    @JvmField
    var datas = mutableListOf<VideoBean>()

    @JvmField
    var userList = mutableListOf<UserBean>()

    init {
        val videoBeanOne = VideoBean().apply {
            coverRes = R.mipmap.cover1
            content = "#街坊 #颜值打分 给自己颜值打100分的女生集合"
            videoRes = R.raw.video1
            distance = 7.9f
            isFocused = false
            isLiked = true
            likeCount = 226823
            commentCount = 3480
            shareCount = 4252
            userBean = UserBean().apply {
                uid = 1
                head = R.mipmap.head1
                nickName = "南京街坊"
                sign = "你们喜欢的话题，就是我们采访的内容"
                subCount = 119323
                focusCount = 482
                fansCount = 32823
                workCount = 42
                dynamicCount = 42
                likeCount = 821
                userList.add(this)
            }
        }

        val videoBeanTwo = VideoBean().apply {
            coverRes = R.mipmap.cover2
            content = "400 户摊主开进济南环联夜市，你们要的烟火气终于来了！"
            videoRes = R.raw.video2
            distance = 19.7f
            isFocused = true
            isLiked = false
            likeCount = 1938230
            commentCount = 8923
            shareCount = 5892
            userBean = UserBean().apply {
                uid = 2
                head = R.mipmap.head2
                nickName = "民生直通车"
                sign = "直通现场新闻，直击社会热点，深入事件背后，探寻事实真相"
                subCount = 20323234
                focusCount = 244
                fansCount = 1938232
                workCount = 123
                dynamicCount = 123
                likeCount = 344
                userList.add(this)
            }
        }

        val videoBeanThree = VideoBean().apply {
            coverRes = R.mipmap.cover3
            content = "科比生涯霸气庆祝动作，最后动作诠释了一生荣耀 #科比 @路人王篮球 "
            videoRes = R.raw.video3
            distance = 15.9f
            isFocused = false
            isLiked = false
            likeCount = 592032
            commentCount = 9221
            shareCount = 982
            userBean = UserBean().apply {
                uid = 3
                head = R.mipmap.head3
                nickName = "七叶篮球"
                sign = "老科的视频会一直保留，想他了就回来看看"
                subCount = 1039232
                focusCount = 159
                fansCount = 29232323
                workCount = 171
                dynamicCount = 173
                likeCount = 1724
                userList.add(this)
            }
        }

        val videoBeanFour = VideoBean().apply {
            coverRes = R.mipmap.cover4
            content = "美好的一天，从发现美开始 #莉莉柯林斯 "
            videoRes = R.raw.video4
            distance = 25.2f
            isFocused = false
            isLiked = false
            likeCount = 887232
            commentCount = 2731
            shareCount = 8924
            userBean = UserBean().apply {
                uid = 4
                head = R.mipmap.head4
                nickName = "一只爱修图的剪辑师"
                sign = "接剪辑，活动拍摄，修图单\n 合作私信"
                subCount = 2689424
                focusCount = 399
                fansCount = 360829
                workCount = 562
                dynamicCount = 570
                likeCount = 4310
                userList.add(this)
            }
        }

        val videoBeanFive = VideoBean().apply {
            coverRes = R.mipmap.cover5
            content = "有梦就去追吧，我说到做到。 #网球  #网球小威 "
            videoRes = R.raw.video5
            distance = 9.2f
            isFocused = false
            isLiked = false
            likeCount = 8293241
            commentCount = 982
            shareCount = 8923
            userBean = UserBean().apply {
                uid = 5
                head = R.mipmap.head5
                nickName = "国际网球联合会"
                sign = "ITF国际网球联合会负责制定统一的网球规则，在世界范围内普及网球运动"
                subCount = 1002342
                focusCount = 87
                fansCount = 520232
                workCount = 89
                dynamicCount = 122
                likeCount = 9
                userList.add(this)
            }
        }

        val videoBeanSix = VideoBean().apply {
            coverRes = R.mipmap.cover6
            content = "能力越大，责任越大，英雄可能会迟到，但永远不会缺席  #蜘蛛侠 "
            videoRes = R.raw.video6
            distance = 16.4f
            isFocused = true
            isLiked = true
            likeCount = 2109823
            commentCount = 9723
            shareCount = 424
            userBean = UserBean().apply {
                uid = 6
                head = R.mipmap.head6
                nickName = "罗鑫颖"
                sign = "一个行走在Tr与剪辑之间的人\n 有什么不懂的可以来直播间问我"
                subCount = 29342320
                focusCount = 67
                fansCount = 7028323
                workCount = 5133
                dynamicCount = 5159
                likeCount = 0
                userList.add(this)
            }
        }

        val videoBeanSeven = VideoBean().apply {
            coverRes = R.mipmap.cover7
            content = "真的拍不出来你的神颜！现场看大屏帅疯！#陈情令南京演唱会 #王一博 😭"
            videoRes = R.raw.video7
            distance = 16.4f
            isFocused = false
            isLiked = false
            likeCount = 185782
            commentCount = 2452
            shareCount = 3812
            userBean = UserBean().apply {
                uid = 7
                head = R.mipmap.head7
                nickName = "Sean"
                sign = "云深不知处"
                subCount = 471932
                focusCount = 482
                fansCount = 371423
                workCount = 242
                dynamicCount = 245
                likeCount = 839
                userList.add(this)
            }
        }

        val videoBeanEight = VideoBean().apply {
            coverRes = R.mipmap.cover8
            content = "逆序只是想告诉大家，学了舞蹈的她气质开了挂！"
            videoRes = R.raw.video8
            distance = 8.4f
            isFocused = false
            isLiked = false
            likeCount = 1708324
            commentCount = 8372
            shareCount = 982
            userBean = UserBean().apply {
                uid = 8
                head = R.mipmap.head8
                nickName = "曹小宝"
                sign = "一个晒娃狂魔麻麻，平日里没啥爱好！喜欢拿着手机记录孩子成长片段，风格不喜勿喷！"
                subCount = 1832342
                focusCount = 397
                fansCount = 1394232
                workCount = 164
                dynamicCount = 167
                likeCount = 0
                userList.add(this)
            }
        }

        datas.add(videoBeanOne)
        datas.add(videoBeanTwo)
        datas.add(videoBeanThree)
        datas.add(videoBeanFour)
        datas.add(videoBeanFive)
        datas.add(videoBeanSix)
        datas.add(videoBeanSeven)
        datas.add(videoBeanEight)
        datas.add(videoBeanOne)
        datas.add(videoBeanTwo)
        datas.add(videoBeanThree)
        datas.add(videoBeanFour)
        datas.add(videoBeanFive)
        datas.add(videoBeanSix)
        datas.add(videoBeanSeven)
        datas.add(videoBeanEight)
    }

}