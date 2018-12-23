function loadPage(id, url) {
    $.get(url, {}, function (data) {
        $('#' + id).html(data);
    });
}