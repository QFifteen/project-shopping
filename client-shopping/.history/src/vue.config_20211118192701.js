const path = require('path');
/**
 * 自动引入全局的less变量
 * @param {*} rule
 */
const addStyleResource = (rule) => {
    rule.use('style-resource')
        .loader('style-resources-loader')
        .options({
            patterns: [
                // 需要全局导入的less,这个地方一点要写./src才行,否则会报错...
                path.resolve(__dirname, '../src/assets/css/style.less')
            ]
        });
};


pluginOptions: {
    'style-resources-loader': {
      preProcessor: 'less',
      patterns: [
      // 下面这段是自己加的，根据自己文件的位置来修改
          path.resolve(__dirname, "src/assets/css/global.less")
      ]
    }
  }

1
2
3
4
5
6
7
8
9
module.exports = {
    chainWebpack: (config) => {
        const types = ['vue-modules', 'vue', 'normal-modules', 'normal'];
        types.forEach(type => addStyleResource(config.module.rule('less').oneOf(type)));
    },
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true
            }
        }
    }
};