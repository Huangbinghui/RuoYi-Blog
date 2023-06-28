package com.ruoyi.blog.controller;

import com.ruoyi.blog.domain.BlogInfo;
import com.ruoyi.blog.service.IBlogInfoService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 博客管理Controller
 *
 * @author herberth
 * @date 2023-06-17
 */
@RestController
@RequestMapping("/blog")
public class BlogInfoController extends BaseController {
    @Autowired
    private IBlogInfoService blogInfoService;

    /**
     * 查询博客管理列表
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:list')")
    @GetMapping("/list")
    public TableDataInfo list(BlogInfo blogInfo) {
        startPage();
        List<BlogInfo> list = blogInfoService.selectBlogInfoList(blogInfo);
        return getDataTable(list);
    }

    /**
     * 导出博客管理列表
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:export')")
    @Log(title = "博客管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BlogInfo blogInfo) {
        List<BlogInfo> list = blogInfoService.selectBlogInfoList(blogInfo);
        ExcelUtil<BlogInfo> util = new ExcelUtil<>(BlogInfo.class);
        util.exportExcel(response, list, "博客管理数据");
    }

    /**
     * 获取博客管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id) {
        return success(blogInfoService.selectBlogInfoById(id));
    }

    /**
     * 新增博客管理
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:add')")
    @Log(title = "博客管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BlogInfo blogInfo) {
        return toAjax(blogInfoService.insertBlogInfo(blogInfo));
    }

    /**
     * 修改博客管理
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:edit')")
    @Log(title = "博客管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BlogInfo blogInfo) {
        return toAjax(blogInfoService.updateBlogInfo(blogInfo));
    }

    /**
     * 删除博客管理
     */
    @PreAuthorize("@ss.hasPermi('blog:blog:remove')")
    @Log(title = "博客管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{id}")
    public AjaxResult remove(@PathVariable String id) {
        return toAjax(blogInfoService.deleteBlogInfoById(id));
    }
}
