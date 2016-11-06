Highcharts.setOptions({
    chart: {
        zoomType: 'x',
        style: {
            fontFamily: '"Helvetica Neue", Helvetica, Arial, sans-serif',
            fontWeight: 300,
            fontSize: '12px'
        }
    },
    plotOptions: {
        series: {
            animation: false,
            marker : {
                enabled : false
            }
        }
    },
    credits: {
        enabled: false
    },
    title: {
        text: null
    },
    scrollbar: {
        enabled: false
    }
});