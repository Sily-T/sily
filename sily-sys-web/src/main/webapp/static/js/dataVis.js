$().ready(function () {
    // 初始化echarts
    var deptChart = echarts.init(document.getElementById('chart-dept'));
    var sexChart = echarts.init(document.getElementById('chart-sex'));
    // 指定图表的配置项和数据
    sexChartOption = {
        title : {
            text: '男女比例',
            subtext: 'S',
            x:'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            orient: 'vertical',
            left: 'left',
            data: ['未知','男','女']
        },
        series : [
            {
                name: '访问来源',
                type: 'pie',
                radius : '55%',
                center: ['50%', '60%'],
                data:[
                    {value:5, name:'未知'},
                    {value:310, name:'男'},
                    {value:234, name:'女'},
                ],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            }
        ]
    };
    deptChartOption = {
        color: ['#7d85db'],
        tooltip : {
            trigger: 'axis',
            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
            }
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        xAxis : [
            {
                type : 'category',
                data: ['部门1','部门2','部门3','部门4','部门5'],
                axisTick: {
                    alignWithLabel: true
                }
            }
        ],
        yAxis : [
            {
                type : 'value'
            }
        ],
        series : [
            {
                name:'部门人数',
                type:'bar',
                barWidth: '60%',
                data:[210, 152, 200, 334, 390, 330, 220]
            }
        ]
    };

    deptChart.setOption(deptChartOption);
    sexChart.setOption(sexChartOption);
});