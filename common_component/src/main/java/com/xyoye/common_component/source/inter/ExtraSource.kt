package com.xyoye.common_component.source.inter

/**
 * Created by xyoye on 2021/11/14.
 *
 * 扩展资源，弹幕+字幕
 */

interface ExtraSource {
    // MOD (10.14.2023) - BEGIN : Added danmuHint
    fun getDanmuHint(): String?

    fun setDanmuHint(hint: String?)
    // MOD (10.14.2023) - END

    fun getDanmuPath(): String?

    fun setDanmuPath(path: String)

    fun getEpisodeId(): Int

    fun setEpisodeId(id: Int)

    fun getSubtitlePath(): String?

    fun setSubtitlePath(path: String)
}