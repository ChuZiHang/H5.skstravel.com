

    <header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="${prc }/assets/images/logo01.png" alt="" width="80"/>
        <div class="center">
            <img src="${prc }/assets/images/my.png " alt=""/>
        </div>
    </header>
    <script>
        $(".mobile-nav").click(function () {
            window.location.href="${prc }/index/subjectList";
        })
        $(".center").click(function () {
            window.location.href="${prc }/user/center";
        })
    </script>
