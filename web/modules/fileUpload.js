/**
 * 上传图片文件
 */
layui.use('upload', function(){
    var upload = layui.upload;

    //执行实例
    var uploadInst = upload.render({
        elem: '#upload' //绑定元素
        ,url: 'gift/upload/' //上传接口
        ,method:'post',
        accept:'images',
        field:'file'
        ,done: function(res){
            //上传完毕回调
            layer.msg("上传成功")
        }
        ,error: function(){
            //请求异常回调
            layer.msgError("上传失败请检查网络")
        }
    });
});