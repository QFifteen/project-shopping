// const path = require('path');
// /**
//  * 自动引入全局的less变量
//  * @param {*} rule
//  */
// const addStyleResource = (rule) => {
//     rule.use('style-resource')
//         .loader('style-resources-loader')
//         .options({
//             patterns: [
//                 // 需要全局导入的less,这个地方一点要写./src才行,否则会报错...
//                 path.resolve(__dirname, '../src/assets/css/style.less')
//             ]
//         });
// };


// module.exports = {
//     chainWebpack: (config) => {
//         const types = ['vue-modules', 'vue', 'normal-modules', 'normal'];
//         types.forEach(type => addStyleResource(config.module.rule('less').oneOf(type)));
//     },
//     css: {
//         loaderOptions: {
//             less: {
//                 javascriptEnabled: true
//             }
//         }
//     }
// };

module.exports = {undefined
    // 加载less加载器，路径：./public/css/common.less
    chainWebpack: config => {undefined
    const oneOfsMap = config.module.rule(‘less’).oneOfs.store
    oneOfsMap.forEach(item => {undefined
    item
    .use('sass-resources-loader')
    .loader('sass-resources-loader')
    .options({undefined
    // Provide path to the file with resources
    resources: ''./public/css/common.less’,
    // Or array of paths
    // resources: [’./path/to/vars.scss’, ‘./path/to/mixins.scss’]
    })
    .end()
    })
    }
    }