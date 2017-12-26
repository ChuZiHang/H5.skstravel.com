

    <header>
        <div class="mobile-nav">
            <span></span>
            <span></span>
            <span></span>
        </div>
        <img src="/assets/images/logo.png" alt="" width="80"/>
        <div class="center">
            <img src="/assets/images/my.png " alt=""/>
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
