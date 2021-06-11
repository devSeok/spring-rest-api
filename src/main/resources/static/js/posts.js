const main = {
    init : function () {
        let _this = this;
        $('#btn-save').on('click', function () {
           _this.save();
        });

        $('#btn-update').on('click', function () {
           _this.update();
        });
    },
    save : function () {
         let data = JSON.stringify({
             "title" : $('#title').val(),
             "content" : $('#content').val(),
             "author" : $('#author').val()
         });
        $.ajax({
            url : "/api/v1/posts",
            type : "post",
            data : data,
            contentType : 'application/json; charset=utf-8',
            
        }).done(function (err){
            alert("성고");
            
        }).fail(function (err){
            console.log(err);
        });
    },
    update : function () {

        let data = JSON.stringify({
            "title" : $('#title').val(),
            "content" : $('#content').val(),
            "author" : $('#author').val()
        });

        let id = $('#id').val();

        $.ajax({
            url : "/api/v1/posts/" + id,
            type : "put",
            data : data,
            contentType : 'application/json; charset=utf-8',

        }).done(function (err){
            alert("성고");

        }).fail(function (err){
            console.log(err);
        });
    }
};

main.init();
