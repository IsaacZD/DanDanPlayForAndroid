package com.xyoye.common_component.source.media

import com.xyoye.common_component.source.MediaSource
import com.xyoye.data_component.enums.MediaType

/**
 * Created by xyoye on 2021/11/14.
 */

class TorrentMediaSource: MediaSource(0, emptyList<Any>()) {
    override fun getVideoUrl(): String {
        TODO("Not yet implemented")
    }

    override fun getVideoTitle(): String {
        TODO("Not yet implemented")
    }

    override fun getCurrentPosition(): Long {
        TODO("Not yet implemented")
    }

    override fun indexTitle(index: Int): String {
        TODO("Not yet implemented")
    }

    override fun getMediaType(): MediaType {
        TODO("Not yet implemented")
    }

    override fun getDanmuPath(): String? {
        TODO("Not yet implemented")
    }

    override fun setDanmuPath(path: String) {
        TODO("Not yet implemented")
    }

    override fun getEpisodeId(): Int {
        TODO("Not yet implemented")
    }

    override fun setEpisodeId(id: Int) {
        TODO("Not yet implemented")
    }

    override fun getSubtitlePath(): String? {
        TODO("Not yet implemented")
    }

    override fun setSubtitlePath(path: String) {
        TODO("Not yet implemented")
    }

    override fun getHttpHeader(): Map<String, String>? {
        TODO("Not yet implemented")
    }

    override suspend fun indexSource(index: Int): MediaSource? {
        TODO("Not yet implemented")
    }

    fun getPlayTaskId(): Long {
        TODO("Not yet implemented")
    }
}