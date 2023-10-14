package com.xyoye.common_component.source.base

import com.xyoye.common_component.source.inter.ExtraSource
import com.xyoye.common_component.source.inter.VideoSource


/**
 * Created by xyoye on 2022/1/11
 */
abstract class BaseVideoSource(
    index: Int,
    videoSources: List<*>
) : GroupVideoSource(index, videoSources), VideoSource, ExtraSource {
    // MOD (10.14.2023) - BEGIN : Added danmuHint
    override fun getDanmuHint(): String? {
        return null
    }

    override fun setDanmuHint(hint: String?) {

    }
    // MOD (10.14.2023) - END

    override fun getDanmuPath(): String? {
        return null
    }

    override fun setDanmuPath(path: String) {

    }

    override fun getEpisodeId(): Int {
        return 0
    }

    override fun setEpisodeId(id: Int) {

    }

    override fun getSubtitlePath(): String? {
        return null
    }

    override fun setSubtitlePath(path: String) {

    }

    override fun getHttpHeader(): Map<String, String>? {
        return null
    }

    override fun getStorageId(): Int? {
        return null
    }

    override fun getStoragePath(): String? {
        return null
    }
}